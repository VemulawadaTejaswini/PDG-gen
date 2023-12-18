 public int palindromify(String pal, String read) {
    StringBuilder sb = new StringBuilder(read);
    int insertions = 0;  
    int palIndex = 0;  
    Set<Character> none = new HashSet<>();
    boolean outOfInput = false;
    for (int i = 0;; i++) {
        if (i >= sb.length()) {
            outOfInput = true;  
        }
        if (palIndex >= pal.length()) {
            sb.delete(i, sb.length());  
        }
        char curr = pal.charAt(palIndex++);  
        if (sb.charAt(i) != curr) {
            
            boolean found = false;
            if (!none.contains(curr)) {  
                for (int w = i + 1; w < sb.length(); w++) {
                    if (sb.charAt(w) == curr) {
                        sb.replace(i, w + 1, "" + curr);  
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    none.add(curr);
                }
            }
            if (!found) {
                 
                sb.insert(i, curr);
                insertions++;  
            }
        }
    }
    
    return insertions + (outOfInput ? pal.length() - sb.length() : 0);
}
 