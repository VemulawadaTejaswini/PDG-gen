import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
    	int N100 = N/100;//100のけた
      	int N10 = (N/10)%10;//
        int N1 = N%10;//1のけた
        if(N1 == 7 || N10 == 7 || N100 == 7){
          System.out.print("Yes");
        }else{
          System.out.print("No");
        }
    }
}