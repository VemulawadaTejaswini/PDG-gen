


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Index> pie = new ArrayList<>();
        
        for(int i=1; i<=13; i++) pie.add(new Index("S",i));
        for(int i=1; i<=13; i++) pie.add(new Index("H",i));
        for(int i=1; i<=13; i++) pie.add(new Index("C",i));
        for(int i=1; i<=13; i++) pie.add(new Index("D",i));
        
        int n = sc.nextInt();
        
        
        for(int j=0; j<n; j++){
            String mo = sc.next();
            int bu = sc.nextInt();
         for(Index ewq : pie){
          if(ewq.x.equals( mo )  && ewq.y == bu){
                 ewq.exist = true;
          }}}
        for(Index ewq : pie){
            if(!ewq.exist){
                System.out.println(ewq.x +" "+ ewq.y);
            }
        }
    }
    
    public static class Index {
        
         boolean exist;
         String x;
         int y;
         
         Index(String x, int y){
         this.x = x;
         this.y = y;
         exist = false;
        
        }
    }
}



        
    

       

   


