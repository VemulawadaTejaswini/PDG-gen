import java.util.*;
public class ABC162_D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] line = sc.next().toCharArray();
        int[][] arr = new int[N][3];
        Map<Character,Integer> m = new HashMap<>();
        m.put('R',0);
        m.put('G',1);
        m.put('B',2);
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                arr[i][m.get(line[j])] +=1;
            }
        }
        
        int total = 0;
        for(int i=0; i<N-1; i++){
            char c = line[i];
            for(int j=i+1; j<N; j++){
                if(c == line[j]) continue;

                char third = getThird(c, line[j]);
                
                if(2*j-i < N && line[2*j-i] == third){
                    total--;
                }
    
                
                total += arr[j][m.get(third)];
            }
        }
        System.out.println(total);

        

    }

    static char getThird(char a, char b){
        if((a=='R' && b=='G')||(a=='G' && b=='R')){
            return 'B';
        }
        if((a=='B' && b=='G')||(a=='G' && b=='B')){
            return 'R';
        }
        return 'G';
    }




    

}