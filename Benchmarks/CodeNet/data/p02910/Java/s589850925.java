public class Main{
    public static void main(String[] args){
    String S ="abababa";
    // char c1 = S.substring(int i%2==0);

        for(int i = 0; i < S.length(); i++){
            // char c = S.charAt(i);
            if (i%2  == 1){
                if (S.charAt(i).equals("R") && S.charAt(i).equals("U") &&S.charAt(i).equals("D"));
            System.out.println("Yes");
            } else if(S.charAt(i).equals("L") && S.charAt(i).equals("U") &&S.charAt(i).equals("D")){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}