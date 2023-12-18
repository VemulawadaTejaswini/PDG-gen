import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sx=Integer.parseInt(sc.next());
        int sy=Integer.parseInt(sc.next());
        int tx=Integer.parseInt(sc.next());
        int ty=Integer.parseInt(sc.next());
        sc.close();
        StringBuffer bf=new StringBuffer();
        for(int i=0;i<tx-sx;i++){
            bf.append('R');
        }
        for(int i=0;i<ty-sy;i++){
            bf.append('U');
        }

        for(int i=0;i<tx-sx;i++){
            bf.append('L');
        }
        for(int i=0;i<ty-sy;i++){
            bf.append('D');
        }

        bf.append('D');
        for(int i=0;i<tx-sx+1;i++){
            bf.append('R');
        }
        for(int i=0;i<ty-sy+1;i++){
            bf.append('U');
        }
        bf.append('L');

        bf.append('U');
        for(int i=0;i<tx-sx+1;i++){
            bf.append('L');
        }
        for(int i=0;i<ty-sy+1;i++){
            bf.append('D');
        }
        bf.append('R');

        System.out.println(bf);
    }
}