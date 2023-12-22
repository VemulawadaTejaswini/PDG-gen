import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,cou=0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag = 1;
        while (flag==1){
            flag = 0;
            for(int j=n-1;j>=1;j--){
                if(arr[j] < arr[j-1]){
                    d=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=d;
                    flag = 1;
                    cou++;
                }
            }
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]);
            if(k!=n-1){
                System.out.print(" ");
            }
        }
        System.out.println("\n"+cou);
        sc.close();
    }
}
