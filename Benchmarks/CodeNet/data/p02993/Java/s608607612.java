import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        char[] code = s.toCharArray();
        String ans = "good";
        for(int i = 0; i< code.length-1;i++){
            if(code[i]==code[i+1]){
                ans ="bad";
            }
        }



        //String s = String.valueOf(i);
        //int i = Integer.parseInt(s);
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");
        System.out.println(ans);
        /*
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int h = Integer.parseInt(tokens[0]);
                int w = Integer.parseInt(tokens[1]);
                
                }
            }
        }
        */
    }
}