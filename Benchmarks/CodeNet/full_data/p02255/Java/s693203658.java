import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for(int i = 0;i < N;i++){
            lst.add(sc.nextInt());
        }
        PrintList(lst);
        for(int i = 1;i < N;i +=1){
            int v = lst.get(i);
            int j = i-1;
            while(0 <= j && lst.get(j) > v){
                lst.set(j+1,lst.get(j));
                j -=1;
            }
            lst.set(j+1,v);
            PrintList(lst);
        }
        
    }

    public static void PrintList(List lst){
        System.out.printf("%d",lst.get(0));
            for(int k = 1;k < lst.size();k +=1){
                System.out.printf(" %d",lst.get(k));
            }
            System.out.println("");
    }
}
