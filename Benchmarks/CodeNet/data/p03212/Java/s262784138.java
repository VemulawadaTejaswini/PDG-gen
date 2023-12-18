import java.util.*;

public class Main {
    static ArrayList<Integer>po=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        aaa("",9);
        Collections.sort(po);
        po.add(1000000000);
        int i=0;
        for(;po.get(i)<=n;i++){}
        System.out.println(i);
    }
    public static void aaa(String a,int n){
        if(a.replace("3","").replace("7","").length()!=0&&a.replace("3","").replace("5","").length()!=0&&a.replace("5","").replace("7","").length()!=0){
            po.add(Integer.parseInt(a));
        }
        if(n!=0){
            aaa(a+3,n-1);
            aaa(a+5,n-1);
            aaa(a+7,n-1);
        }
    }
}
