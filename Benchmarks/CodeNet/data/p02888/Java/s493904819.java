import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<>(); 
        for(int i=0; i<N; i++){
            L.add(scanner.nextInt());
        }

        Collections.sort(L);
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    int a = L.get(i);
                    int b = L.get(j);
                    int c = L.get(k);
                    if(a+b>c && a+c>b && b+c>a){
                        count++;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}