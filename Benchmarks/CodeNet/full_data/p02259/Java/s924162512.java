import java.util.*;
public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] sArray = sc.nextLine().split(" ");
        int[] array=Arrays.stream(sArray).mapToInt(Integer::parseInt).toArray();

        //バブルソート
        //boolean flag =true;
        int i=0;
        int changeCount=0;
        while(i<=n-1){
            for (int j=n-1;j>0;j--){
                if (array[j-1]>array[j]){
                    int tmp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=tmp;
                    changeCount+=1;
                }
            }
            i++;
        }

        StringBuilder sb = new StringBuilder();
 
        for(int k : array)
            sb.append(k + " ");
         
        sb.deleteCharAt(sb.length()-1);
 
        System.out.println(sb);
        System.out.println(changeCount);
    }
}
