import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = Integer.parseInt(sc.next());
        }
        
        int min = 10000;
        int mp;
        int lengthA, lengthB, lengthC;
        int mask;
        for(int i = 0; i < Math.pow(4, n); i++){
            mp = 0;
            lengthA = 0;
            lengthB = 0;
            lengthC = 0;
            for(int j = 0; j < n; j++){
                mask = 0b11 << j*2;
                if((i & mask) == 0){
                    
                    if(lengthA != 0){
                        mp += 10;
                    }
                    lengthA += l[j];
                    
                }else if((i & mask) == 0b01 << j*2){
                    if(lengthB != 0){
                        mp += 10;
                    }
                    lengthB += l[j];
                    
                }else if((i & mask) == 0b10 << j*2){
                    if(lengthC != 0){
                        mp += 10;
                    }
                    lengthC += l[j];
                }
            }
            if(lengthA == 0 || lengthB == 0 || lengthC == 0){
                continue;
            }
            mp += Math.abs(a - lengthA) + Math.abs(b - lengthB) + Math.abs(c - lengthC);
            if(mp < min){
                min = mp;
            }
        }
        
        System.out.println(min);
    }
}