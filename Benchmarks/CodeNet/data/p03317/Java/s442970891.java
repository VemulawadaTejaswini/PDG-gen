import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        int indexMin = a.indexOf(1);
        boolean b = true;
        boolean c = false;
        boolean d = false;
        int instance = indexMin-1;
        int count = 0;
        while (b){
            if(instance>0){
                instance -= k-1;
                count++;
            }else if (instance<0){
                b = false;
            }else {
                c = true;
                b = false;
            }
        }
        b = true;
        instance = n-1-indexMin;
        while (b){
            if(instance>0){
                instance -= k-1;
                count++;
            }else if (instance<0){
                b = false;
            }else {
                d = true;
                b = false;
            }
        }
        if (c&&d){
            count--;
        }
        if ((indexMin-1)%(k-1)==1&&(n-indexMin-1)%(k-1)==1&&indexMin>k-1&&n-indexMin>k){
            count--;
        }
        System.out.println(count);
    }

}
