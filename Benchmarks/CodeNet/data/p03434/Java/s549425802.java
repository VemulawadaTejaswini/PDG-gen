import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] num=new int[N];
        int sumA=0;
        int sumB=0;
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
        }
        num=sort(num);
        for(int i=0;i<N;i++){
            if(i%2 == 0){
                sumA+=num[i];
            }else{
                sumB+=num[i];
            }
        }
        System.out.println(sumA-sumB);
    }

    static int[] sort(int[] num){
        int temp=0;
        for(int i=0;i<num.length-1;i++){
            for(int j=num.length-1;j>i;j--){
                if(num[j] > num[j-1]){
                    temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }
        return num;
    }
}