import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] L = new Integer[N];
        for(int i=0;i<N;i++){
            L[i] = sc.nextInt();
        }
        Arrays.sort(L, Comparator.reverseOrder());
        int count = 0;

        for(int i=0;i<L.length;i++) {
            for(int j=i+1;j<L.length;j++){
                for(int k=j+1;k<L.length;k++){
                    boolean flag = true;
                    if(L[i] < L[j] + L[k] && L[j] < L[i] + L[k] && L[k] < L[i] + L[j]){
                        count++;
                    }else {
                        flag = false;
                    } 
                    if(flag == false){
                        break;
                    }
                    System.out.print(L[i]+" ");
                    System.out.print(L[j]+" ");
                    System.out.println(L[k]); 
                }
            }
        }

        System.out.println(count);
        
    }
}