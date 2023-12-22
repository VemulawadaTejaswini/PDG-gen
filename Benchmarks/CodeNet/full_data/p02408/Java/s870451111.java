import java.util.Scanner;

public class Main{
    static StringBuilder sb = new StringBuilder();
    
    static void printCard(char c, int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                sb.append(c + " " + (i + 1) + "\n");
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] s = new int[13];
        int[] h = new int[13];
        int[] c = new int[13];
        int[] d = new int[13];
        
        for(int i = 0; i < num; i++){
            String simbol = sc.next();
            int cardNum = sc.nextInt();
            switch(simbol){
                case "S": s[cardNum - 1] = 1 ; break;
                case "H": h[cardNum - 1] = 1 ; break;
                case "C": c[cardNum - 1] = 1 ; break;
                case "D": d[cardNum - 1] = 1 ; break;
            }
        }
        
        printCard('S', s);
        printCard('H', h);
        printCard('C', c);
        printCard('D', d);
        
        System.out.print(sb);
        
    }
}
