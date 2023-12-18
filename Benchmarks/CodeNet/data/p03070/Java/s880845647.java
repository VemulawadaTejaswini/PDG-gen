import java.util.Scanner;
public class Main{
 
int sum = 0;
int N;
    public static void main (String[] args){
        
        Main main = new Main();
        Scanner sc = new Scanner (System.in);
        
        main.N = sc.nextInt();
        int[] list = new int [main.N];
        
        for (int index=0; index<main.N; index++){
            list[index]=sc.nextInt();
        }
        
        main.find(list,0,0,0,0);
        
        System.out.println(main.sum);
    }
    
    private void find (int[] list, int r, int g, int b, int place){
        if (place==N){
            if (r+g>b&&r+b>g&&b+g>r){
                if (sum<998244353L){
                    sum++;
                } else {
                    sum=0;
                }
            }
            return;
        }
        
        find(list,r+list[place],g,b,place+1);
        find(list,r,g+list[place],b,place+1);
        find(list,r,g,b+list[place],place+1);
    }
}