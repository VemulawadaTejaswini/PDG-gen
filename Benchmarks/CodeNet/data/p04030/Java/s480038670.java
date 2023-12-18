import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String word ;
        String ans="";
        Scanner input =  new Scanner(System.in);
        word=input.nextLine();

        for(int i =0 ;i<word.length();i++){
            if(word.charAt(i)=='B'&&i==0){
                 continue;
            }
            else if (word.charAt(i)=='B'&&i!=0){

                ans = ans.substring(0, ans.length() - 1);
            }
            else{
                ans+=word.charAt(i);
            }
        }



        System.out.println(ans);



    }
}