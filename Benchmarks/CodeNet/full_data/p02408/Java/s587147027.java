import java.util.*;

public class FindingMissingCards{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] spade = new int[13];
        int[] heart = new int[13];
        int[] club = new int[13];
        int[] diamond = new int[13];

        for(int i=0;i<n;i++){
            String mark = sc.next();
            int number = sc.nextInt();

            switch(mark){
                case "S":
                    spade[number-1]++;
                    break;
                case "H":
                    heart[number-1]++;
                    break;
                case "C":
                    club[number-1]++;
                    break;
                case "D":
                    diamond[number-1]++;
                    break;
            }
        }
        for(int i=0;i<13;i++){
           if(spade[i]==0) {System.out.println("S " + (i+1));}
        }for(int i=0;i<13;i++){
            if(heart[i]==0) {System.out.println("H " + (i+1));}  
        }for(int i=0;i<13;i++){
            if(club[i]==0) {System.out.println("C " + (i+1));}
        }for(int i=0;i<13;i++){
            if(diamond[i]==0) {System.out.println("D " + (i+1));}
        }
    }
}
