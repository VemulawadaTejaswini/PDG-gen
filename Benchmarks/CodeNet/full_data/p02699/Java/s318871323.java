import java.util.*;
import java.io.*;

public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  
  int hitsuji=int(scan.next());
  int ookami=int(scan.next());
  
  if(hitsuji<=ookami){
    System.out.println("unsafe");
  }
  else{
    System.out.println("safe");
  }
  
    