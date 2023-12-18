import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        int arr[]  =new int[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(in.nextLine());
        }
        Program obj = new Program(arr,n);
        System.out.println(obj.find());           
    }
}
class Program{
    int arr[],n; 
    Program(int arr[],int n){
        this.arr = arr; this.n = n;
    }
    int find(){
        int temp = 0,t2 = 0,ans=0,revans=0;
        for(int i=0;i<n;i++){
            temp+=arr[i];
            t2 += arr[n-1-i];
            if (temp%10!=0) ans = temp;
            if (t2%10!=0) revans = t2;
        }
        return ans>revans?ans:revans;
    }
}