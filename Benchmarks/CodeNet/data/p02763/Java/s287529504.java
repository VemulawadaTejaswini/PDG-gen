import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        String s = sc.next();
		int b = sc.nextInt();
        int c;
        int [] in = new int [26];
        for(int i=0;i<b;i++){if(sc.nextInt()==1){c = sc.nextInt();
                                                 s = s.substring(0,c)+sc.next()+s.substring(c+1,a);}
                             else{c=0; 
                                  String t = s.substring(sc.nextInt(),sc.nextInt()+1);
                                  for(int j=0;j<26;j++){in[i]=0;} 
                                  for(int j=0;j<t.length();j++){if(t.charAt(j)=='a'){in[0]=1;}
                                                                if(t.charAt(j)=='b'){in[1]=1;}
                                                                if(t.charAt(j)=='c'){in[2]=1;}
                                                                if(t.charAt(j)=='d'){in[3]=1;}
                                                                if(t.charAt(j)=='e'){in[4]=1;}
                                                                if(t.charAt(j)=='f'){in[5]=1;}
                                                                if(t.charAt(j)=='g'){in[6]=1;}
                                                                if(t.charAt(j)=='h'){in[7]=1;}
                                                                if(t.charAt(j)=='i'){in[8]=1;}
                                                                if(t.charAt(j)=='j'){in[9]=1;}
                                                                if(t.charAt(j)=='k'){in[10]=1;}
                                                                if(t.charAt(j)=='l'){in[11]=1;}
                                                                if(t.charAt(j)=='m'){in[12]=1;}
                                                                if(t.charAt(j)=='n'){in[13]=1;}
                                                                if(t.charAt(j)=='o'){in[14]=1;}
                                                                if(t.charAt(j)=='p'){in[15]=1;}
                                                                if(t.charAt(j)=='q'){in[16]=1;}
                                                                if(t.charAt(j)=='r'){in[17]=1;}
                                                                if(t.charAt(j)=='s'){in[18]=1;}
                                                                if(t.charAt(j)=='t'){in[19]=1;}
                                                                if(t.charAt(j)=='u'){in[20]=1;}
                                                                if(t.charAt(j)=='v'){in[21]=1;}
                                                                if(t.charAt(j)=='w'){in[22]=1;}
                                                                if(t.charAt(j)=='x'){in[23]=1;}
                                                                if(t.charAt(j)=='y'){in[24]=1;}
                                                                if(t.charAt(j)=='z'){in[25]=1;}
                                                               }
                                  for(int j=0;j<26;j++){c+=in[j];}
                                  System.out.println(c);
                                 }
                            }		
	}
}