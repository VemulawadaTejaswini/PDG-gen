import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int num =0;
        int mix = 0;
        int mixnum = 0;
        
      
        
        for(int i = A;i < B;i++) {
        	if(i%C!=0 && i%D!=0) num++;
        }
        System.out.println(num);
    }
}