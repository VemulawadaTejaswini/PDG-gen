import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        boolean po[][]=new boolean[h][w];
        ArrayList<Oder>oder=new ArrayList<>();
        for(int i=0;i<h;i++){
            String s[]=sc.next().split("",0);
            for(int j=0;j<w;j++){
                po[i][j]=s[j].equals("#");
                if(s[j].equals("#"))oder.add(new Oder(j,i));
            }
        }
        
        boolean b=false;
        int count=0;
        oder.add(new Oder(-1,-1));
        while(oder.size()!=1){
            Oder o=oder.get(0);
            oder.remove(0);
            if(o.x==-1&&o.y==-1){
                count++;
                oder.add(new Oder(-1,-1));
            }   
            else{
                if(o.x!=w-1){
                    if(!po[o.y][o.x+1]){
                        oder.add(new Oder(o.x+1,o.y));
                        po[o.y][o.x+1]=true;
                    }
                }
                if(o.x!=0){
                    if(!po[o.y][o.x-1]){
                        oder.add(new Oder(o.x-1,o.y));
                        po[o.y][o.x-1]=true;
                    }
                }
                if(o.y!=h-1){
                    if(!po[o.y+1][o.x]){
                        oder.add(new Oder(o.x,o.y+1));
                        po[o.y+1][o.x]=true;
                    }
                }
                if(o.y!=0){
                    if(!po[o.y-1][o.x]){
                        oder.add(new Oder(o.x,o.y-1));
                        po[o.y-1][o.x]=true;
                    }
                }
                
            }
        }
        System.out.println(count);
    }
}
class Oder{
    int x,y;
    public Oder(int a,int b){
        x=a;
        y=b;
    }
}
