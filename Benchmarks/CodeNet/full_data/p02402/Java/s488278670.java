import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();                                                                 
        String str = in.nextLine();
        int max = 0;
        int min = 0;
        long sum = 0;
        String[] strArr = str.split(" ");
        for(int i = 0; i < n; i++){
            int b = Integer.parseInt(strArr[i]);
            if(b < min){
                min = b;
            }
            if(b < max){
                max = b;
            }
            sum =+ b;

        }
        System.out.println(min + "  " + max + " " + sum);
    }
}