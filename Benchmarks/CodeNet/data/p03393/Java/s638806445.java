import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=26;
        int[]moji=new int[N];
        String S=sc.next();
        char[]hairetu=new char[S.length()];
        for(int i=0;i<S.length();i++){
            hairetu[i]=S.charAt(i);
        }
        for(int i=0;i<N;i++){
            moji[i]=0;
        }
        for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='a'){
                moji[0]++;
            }
            if(S.charAt(i)=='b'){
                moji[1]++;
            }
            if(S.charAt(i)=='c'){
                moji[2]++;
            }
            if(S.charAt(i)=='d'){
                moji[3]++;
            }
            if(S.charAt(i)=='e'){
                moji[4]++;
            }
            if(S.charAt(i)=='f'){
                moji[5]++;
            }
            if(S.charAt(i)=='g'){
                moji[6]++;
            }
            if(S.charAt(i)=='h'){
                moji[7]++;
            }
            if(S.charAt(i)=='i'){
                moji[8]++;
            }
            if(S.charAt(i)=='j'){
                moji[9]++;
            }
            if(S.charAt(i)=='k'){
                moji[10]++;
            }
            if(S.charAt(i)=='l'){
                moji[11]++;
            }
            if(S.charAt(i)=='m'){
                moji[12]++;
            }
            if(S.charAt(i)=='n'){
                moji[13]++;
            }
            if(S.charAt(i)=='o'){
                moji[14]++;
            }
            if(S.charAt(i)=='p'){
                moji[15]++;
            }
            if(S.charAt(i)=='q'){
                moji[16]++;
            }
            if(S.charAt(i)=='r'){
                moji[17]++;
            }
            if(S.charAt(i)=='s'){
                moji[18]++;
            }
            if(S.charAt(i)=='t'){
                moji[19]++;
            }
            if(S.charAt(i)=='u'){
                moji[20]++;
            }
            if(S.charAt(i)=='v'){
                moji[21]++;
            }
            if(S.charAt(i)=='w'){
                moji[22]++;
            }
            if(S.charAt(i)=='x'){
                moji[23]++;
            }
            if(S.charAt(i)=='y'){
                moji[24]++;
            }
            if(S.charAt(i)=='z'){
                moji[25]++;
            }
        }
        for(int i=0;i<N;i++){
            if(S.equals("zyxwvutsrqponmlkjihgfedcba")){
                System.out.println(-1);
                break;

            }
            if(moji[i]!=1){
                if(i==0){
                    System.out.println(S+'a');
                    break;
                }
                if(i==1){
                    System.out.println(S+'b');
                    break;
                }
                if(i==2){
                    System.out.println(S+'c');
                    break;
                }
                if(i==3){
                    System.out.println(S+'d');
                    break;
                }
                if(i==4){
                    System.out.println(S+'e');
                    break;
                }
                if(i==5){
                    System.out.println(S+'f');
                    break;
                }
                if(i==6){
                    System.out.println(S+'g');
                    break;
                }
                if(i==7){
                    System.out.println(S+'h');
                    break;
                }
                if(i==8){
                    System.out.println(S+'i');
                    break;
                }
                if(i==9){
                    System.out.println(S+'j');
                    break;
                }
                if(i==10){
                    System.out.println(S+'k');
                    break;
                }
                if(i==11){
                    System.out.println(S+'l');
                    break;
                }
                if(i==12){
                    System.out.println(S+'m');
                    break;
                }
                if(i==13){
                    System.out.println(S+'n');
                    break;
                }
                if(i==14){
                    System.out.println(S+'o');
                    break;
                }
                if(i==15){
                    System.out.println(S+'p');
                    break;
                }
                if(i==16){
                    System.out.println(S+'q');
                    break;
                }
                if(i==17){
                    System.out.println(S+'r');
                    break;
                }
                if(i==18){
                    System.out.println(S+'s');
                    break;
                }
                if(i==19){
                    System.out.println(S+'t');
                    break;
                }
                if(i==20){
                    System.out.println(S+'u');
                    break;
                }
                if(i==21){
                    System.out.println(S+'v');
                    break;
                }
                if(i==22){
                    System.out.println(S+'w');
                    break;
                }
                if(i==23){
                    System.out.println(S+'x');
                    break;
                }
                if(i==24){
                    System.out.println(S+'y');
                    break;
                }
                if(i==25){
                    System.out.println(S+'z');
                    break;
                }
                

            }else if((moji[i]==1)&&(i==25)){
                for(int k=0;k<N;k++){
                if((""+S.charAt(25-k)).compareTo((""+S.charAt(24-k)))>0){
                    char[]hu=new char[100];
                    for(int q=0;q<k+1;q++){
                        hu[q]=hairetu[25-q];
                    }
                    for(int q=0;q<k;q++){
                        if((""+hu[q]).compareTo((""+hu[q+1]))>0){
                            char t=hu[q];
                            char u=hu[q+1];
                            hu[q]=u;
                            hu[q+1]=t;


                        }
                    }
                    
                    
                    
                    for(int e=0;e<N-k-2;e++){
                        System.out.print(hairetu[e]);
                        
                    }
                    System.out.println(hu[0]);
                    
                    break;
                   

                }}
            }
            
        }
        
        }
       
        
    }