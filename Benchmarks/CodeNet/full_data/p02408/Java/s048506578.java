import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Card card[]=new Card[4];
        card[0]=new Card('S');
        card[1]=new Card('H');
        card[2]=new Card('C');
        card[3]=new Card('D');
        String mark;
        int rank;
        while(n-->0){
            mark=sc.next();
            rank=sc.nextInt();
            switch(mark){
                case "S":
                    card[0].existTrue(rank-1);
                    break;
                case "H":
                    card[1].existTrue(rank-1);
                    break;
                case "C":
                    card[2].existTrue(rank-1);
                    break;
                case "D":
                    card[3].existTrue(rank-1);
                    break;
            }   
        }
        for(int i=0;i<4;i++)card[i].printNotExist();
    }
}

class Card{
    private boolean exist[]=new boolean[13];
    private char mark;
    Card(char m){
        this.mark=m;
        for(int i=0;i<13;i++)this.exist[i]=false;
    }
    public void existTrue(int x){
        this.exist[x]=true;
    }
    public void printNotExist(){
        for(int i=0;i<13;i++){
            if(!this.exist[i])System.out.printf("%c %d\n",this.mark,i+1);
        }
    }
}
