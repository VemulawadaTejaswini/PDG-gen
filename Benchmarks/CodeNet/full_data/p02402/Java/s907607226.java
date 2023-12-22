import java.util.Scanner;
class Main{
    int n,i;
    int max = -9999999;
    int min = 9999999;
    long sam = 0;

    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sam = sam + a[i];
            if(n == 0){
                min = 0;
                max = 0;
            }else if(n == 1){
                max = a[i];
                min = a[i];
            }else if(a[i] < min){
                min = a[i];
            }else if(a[i] > max){
                max = a[i];
            }else if(a[i] == min || a[i] == max){
                continue;
            }
           
        }
    System.out.println(min + " " + max + " " + sam);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}