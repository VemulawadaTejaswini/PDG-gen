import java.util.Scanner;

class Main {
	public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         
        for(int i = 3; i <= n; i ++){
            String str = String.valueOf(i);
            if(i % 3 == 0 || str.indexOf("3") != -1){
                System.out.print(" "+i);    
            }
        }
        System.out.println();
        sc.close();
    }
}
