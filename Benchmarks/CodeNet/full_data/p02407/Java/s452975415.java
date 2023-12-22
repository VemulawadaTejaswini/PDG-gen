import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = sc.nextLine().split(" ");
        for(int i=n-1;i>=0;i--){
            if(i==0){
                System.out.print(str[i]);
            }else{
                System.out.print(str[i]+" ");
            }
        }
        System.out.println();
    }
}
