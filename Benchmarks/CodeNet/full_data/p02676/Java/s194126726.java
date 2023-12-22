import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String str = sc.next();

        String answer;

        if (str.length()<= length){
            answer = str;
        }else{
            answer = str.substring(0, length) + "...";
        }
        System.out.println(answer);
    }
}