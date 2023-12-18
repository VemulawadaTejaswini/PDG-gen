import java.util.Scanner;

class Main {

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String[] args) {
        String word ;
        int x;
        Scanner input =  new Scanner(System.in);
        word=input.nextLine();

        for(int i =0 ;i<word.length();i++){
            x=i;
            if(word.charAt(i)=='B'&&i!=0){
                word=charRemoveAt(word, x-1);

            }
        }
        word=word.replace("B","");


        System.out.println(word);



    }
}