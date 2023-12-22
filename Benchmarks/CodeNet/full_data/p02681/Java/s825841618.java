import java.util.Scanner;

class Main {
    static void getAnswer(String S , String T){
        int count = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==T.charAt(i)){
                count ++;
            }

        }
        if(count==S.length()) System.out.println("YES");
        else System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           String S = sc.nextLine();
           String T = sc.nextLine();
           getAnswer(S,T);
            }


}