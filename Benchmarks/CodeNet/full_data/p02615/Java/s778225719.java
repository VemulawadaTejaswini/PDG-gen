import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       List<Integer> list=new ArrayList<>();
       int sum=0;
       for(int i=0;i<n;i++){
           list.add(sc.nextInt());
       }
       Collections.sort(list, Collections.reverseOrder());
       for(int i=0;i<n-1;i++)
       sum+=list.get(i);
       System.out.println(sum);
    }
}