import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int M [][]=new int [3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        M[i][j]=sc.nextInt();}}
    int N = sc.nextInt();
    int P[] =new int [N];
    int x=0;
    for(int k=0;k<N;k++){
      P[k]=sc.nextInt();
      if(P[k]==M[0][0]){x=x+1;}
      else if(P[k]==M[0][1]){x=x+2;}
      else if(P[k]==M[0][2]){x=x+4;}
      else if(P[k]==M[1][0]){x=x+8;}
      else if(P[k]==M[1][1]){x=x+16;}
      else if(P[k]==M[1][2]){x=x+32;}
      else if(P[k]==M[2][0]){x=x+64;}
      else if(P[k]==M[2][1]){x=x+128;}
      else if(P[k]==M[2][2]){x=x+256;}}
    if((x>427)&&
       !(x==432)){System.out.println("Yes");}
    else if((x<424)&&
            (x>419)){System.out.println("Yes");}
    else if((x<416)&&(x>398)){
      if(((x==412)||(x==408))||((x==404)||(x==400))){System.out.println("No");}
      else{System.out.println("Yes");}}
    else if(((x==391)||(x==361))||((x==345)||(x==337))){System.out.println("Yes");}
    else if((x<384)&&
            (x>362)){if(x==368){System.out.println("No");}
                     else{System.out.println("Yes");}}
    else if((x<360)&&
            (x>355)){System.out.println("Yes");}
    else if((x<352)&&
            (x>346)){System.out.println("Yes");}
    else if((x<344)&&
            (x>338)){System.out.println("Yes");}
    else if((((x==335)||(x==333))||((x==331)||(x==329)))||(x==327)){System.out.println("Yes");}
    else if((x<320)&&
            (x>299)){if((x==306)||(x==304)){System.out.println("No");}
                     else{System.out.println("Yes");}}
    else if((x<296)&&
            (x>291)){System.out.println("Yes");}
    else if(((((x==287)||(x==285))||((x==283)||(x==281)))||(((x==279)||(x==277))||((x==275)||(x==273))))||((x==271)||(x==263))){System.out.println("Yes");}
    else if((x<256)&&
            (x>241)){System.out.println("Yes");}
    else if((((x==239)||(x==237))||((x==235)||(x==233)))||(x==231)){System.out.println("Yes");}
    else if((x<224)&&
            (x>209)){if(x==216){System.out.println("No");}
                     else{System.out.println("Yes");}}
    else if((((x==207)||(x==205))||((x==203)||(x==201)))||(x==199)){System.out.println("Yes");}
    else if((x<192)&&
            (x>181)){System.out.println("Yes");}
    else if((((((x==179)||(x==178))||((x==175)||(x==167)))||(((x==159)||(x==158))||((x==155)||(x==154))))||((((x==151)||(x==150))||((x==147)||(x==146)))||(((x==143)||(x==135))||((x==111)||(x==109)))))||((((x==107)||(x==105))||((x==103)||(x==79)))||(((x==77)||(x==75))||((x==73)||(x==71)))))
    {System.out.println("Yes");}
    else if((x<128)&&
            (x>115)){System.out.println("Yes");}
    else if((x<96)&&
            (x>83)){if((x==90)||(x==88)){System.out.println("No");}
                    else{System.out.println("Yes");}}
    else if((x<64)&&
            (x>54)){System.out.println("Yes");}
    else if(((x==47)||(x==39))||(((x==31)||(x==23))||((x==15)||(x==7)))){System.out.println("Yes");}
    else {System.out.println("No");}
  }
}