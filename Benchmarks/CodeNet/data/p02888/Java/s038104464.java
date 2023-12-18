import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for(int i = 0;i < n; i++){
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int count = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    //System.out.println(l[i] + " " + l[j] + " " + l[k]);
                    if(l[i] + l[j] > l[k]){count++;}
                    else{break;}
                }
            }
        }
        System.out.println(count);
    }
}