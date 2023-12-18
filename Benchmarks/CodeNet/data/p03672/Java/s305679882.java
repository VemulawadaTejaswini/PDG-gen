import java.util.*;

class Main {
    public static int main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Map<Character,Integer> chars = new LinkedHashMap<>();
        for (int i=0; i<s.length(); i++){
            if (chars.containsKey(s.charAt(i))){
                chars.replace(s.charAt(i), chars.get(s.charAt(i)), chars.get(s.charAt(i))+1);
            }
            else{
                chars.put(s.charAt(i),1);
            }
        }
        for (int i=s.length(); i>=0; i--){
            Boolean flag = true;
            for (Integer j : chars.values()){
                if (j%2 == 1) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                return 0;
            }
            chars.replace(s.charAt(i),chars.get(s.charAt(i)),chars.get(s.charAt(i))-1);
        }
        return 0;
    }
}