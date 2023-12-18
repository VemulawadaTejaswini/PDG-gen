
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int a=scanner.nextInt();
  int b=scanner.nextInt();
  int c=scanner.nextInt();
  int d=scanner.nextInt();
  int e=scanner.nextInt();
  int f=scanner.nextInt();
  scanner.close();
  List<Integer> water=new ArrayList<Integer>();
  int nextWater=b;
  int nextIndexWater=-1;
  int small=0;
  double max=0.;
  int waterMax=0;
  int sugarMax=0;
  while(true){
   if(small+a<nextWater){
    small+=a;
    if(100*small>f) break;
    water.add(small);
   }else{
    if(100*nextWater>f) break;
    water.add(nextWater);
    nextIndexWater++;
    if(nextWater==small+a) small=nextWater;
    nextWater=water.get(nextIndexWater)+b;
   }
   if(water.size()==0) continue;
   int waterAmount=water.get(water.size()-1);
   List<Integer> sugar=new ArrayList<Integer>();
   int nextSugar=d;
   int nextIndexSugar=-1;
   int smallSugar=0;
   while(true){
    if(smallSugar+c<nextSugar){
     smallSugar+=c;
     if(100*waterAmount+smallSugar>f||smallSugar>e*waterAmount) break;
     sugar.add(smallSugar);
    }else{
     if(100*waterAmount+nextSugar>f||nextSugar>e*waterAmount) break;
     sugar.add(nextSugar);
     nextIndexSugar++;
     if(nextSugar==smallSugar+c) smallSugar=nextSugar;
     nextSugar=sugar.get(nextIndexSugar)+d;
    }
   }
   if(sugar.size()==0) continue;
   int sugarAmount=sugar.get(sugar.size()-1);
   double concentration=(double)sugarAmount/(100.*waterAmount+sugarAmount);
   if(concentration>max){
    max=concentration;
    waterMax=waterAmount;
    sugarMax=sugarAmount;
   }
  }
  System.out.println((waterMax*100+sugarMax)+" "+sugarMax);
 }
}
