import java.util.*;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
  int omo[]=new int[4];
  for(int i=0;i<4;i++)
    omo[i]=s.nextInt();
  if(omo[0]+omo[1]<omo[2]+omo[3])
    System.out.print("Right");
  else if(omo[0]+omo[1]>omo[2]+omo[3])
    System.out.print("Left");
  else
    System.out.print("Balanced");
}
}