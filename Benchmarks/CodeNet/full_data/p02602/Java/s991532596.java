import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int i=0,j=0,ind=0;
        double count=1;
        String ans[] = new String[n-k];
        while(j<n){
            if(j<k){
                count*=arr[j];
            }else{
                double newCount = (count*arr[j])/arr[i++];
                // System.out.println(newCount+" "+count);
                ans[ind++] = newCount>count?"Yes":"No";
                count=newCount;
            }
            j++;
        }
        for(String val: ans){
            System.out.println(val);
        }

    }
}