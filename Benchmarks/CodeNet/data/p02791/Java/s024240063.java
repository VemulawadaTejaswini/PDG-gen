import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static boolean isSorted(ArrayList<Integer> list, int n) 
    { 
        if (n == 0 || n == 1) 
            return true; 
        for (int i = 1; i < n; i++)  
            if (list.get(i-1) < list.get(i)) 
                return false; 
        return true; 
    }
    static boolean isSortedAsc(ArrayList<Integer> list, int n) 
    { 
        if (n == 0 || n == 1) 
            return true; 
        for (int i = 1; i < n; i++)  
            if (list.get(i-1) > list.get(i)) 
                return false; 
        return true; 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(num);
        for(int i=0;i<num;i++){
            list.add(s.nextInt());
        }
        if(isSorted(list, num)){
            System.out.println(num);
            s.close();
            return;
        }
        if(isSortedAsc(list, num)){
            System.out.println(1);
            s.close();
            return;
        }
        int count=num;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(list.get(i)>list.get(j)){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
        s.close();
    }
}