
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            list.add(num);
        }
        iSort(list,n);
    }

    private static void iSort(List<Integer> list, int n){
        int count=0;
        List<Integer> sbList = new ArrayList<>(list);
        for(int num : list){
            for(int i = count-1; i >= 0 && sbList.get(i)>num; i--){
                sbList.set(i+1,sbList.get(i));
                sbList.set(i,num);
            }
            count++;

            for(int i = 0; i < list.size(); i ++){
                if(i == n-1)System.out.println(sbList.get(i));
                else System.out.print(sbList.get(i) + " ");
            }
        }
    }

}

