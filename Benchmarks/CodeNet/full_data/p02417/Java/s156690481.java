import java.io.*;
import java.util.Arrays;

public class Main{ 
        public static void main(String[] args){
            int count=0,jc=0,il;
            int bl[],al[];
            String moji;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{    bl = new int[400];
                al = new int[40];
                Arrays.fill(al,0);
                char[] moji1=new char[120];
                while(true){
                    moji=reader.readLine();
                    bl[jc]=moji.length();
                    String kmoji=moji.toLowerCase();
                    for(il=0;il<bl[jc];il++){
                        moji1[il]=kmoji.charAt(il);
                    }
                    if(moji.length()==0){
                        break;
                    }
                for(il=0;il<bl[jc];il++){
                    if(moji1[il]=='a'){
                        al[0]+=1;
                    }
                    if(moji1[il]=='b'){
                        al[1]+=1;
                    }
                    if(moji1[il]=='c'){
                        al[2]+=1;
                    }
                    if(moji1[il]=='d'){
                        al[3]+=1;
                    }
                    if(moji1[il]=='e'){
                        al[4]+=1;
                    }
                    if(moji1[il]=='f'){
                        al[5]+=1;
                    }
                    if(moji1[il]=='g'){
                        al[6]+=1;
                    }
                    if(moji1[il]=='h'){
                        al[7]+=1;
                    }
                    if(moji1[il]=='i'){
                        al[8]+=1;
                    }
                    if(moji1[il]=='j'){
                        al[9]+=1;
                    }
                    if(moji1[il]=='k'){
                        al[10]+=1;
                    }
                    if(moji1[il]=='l'){
                        al[11]+=1;
                    }
                    if(moji1[il]=='m'){
                        al[12]+=1;
                    }
                    if(moji1[il]=='n'){
                        al[13]+=1;
                    }
                    if(moji1[il]=='o'){
                        al[14]+=1;
                    }
                    if(moji1[il]=='p'){
                        al[15]+=1;
                    }
                    if(moji1[il]=='q'){
                        al[16]+=1;
                    }
                    if(moji1[il]=='r'){
                        al[17]+=1;
                    }
                    if(moji1[il]=='s'){
                        al[18]+=1;
                    }
                    if(moji1[il]=='t'){
                        al[19]+=1;
                    }
                    if(moji1[il]=='u'){
                        al[20]+=1;
                    }
                    if(moji1[il]=='v'){
                        al[21]+=1;
                    }
                    if(moji1[il]=='w'){
                        al[22]+=1;
                    }
                    if(moji1[il]=='x'){
                        al[23]+=1;
                    }
                    if(moji1[il]=='y'){
                        al[24]+=1;
                    }
                    if(moji1[il]=='z'){
                        al[25]+=1;
                    }
                }
                    jc++;
                }
                System.out.println("a : " + al[0]);
                System.out.println("b : " + al[1]);
                System.out.println("c : " + al[2]);
                System.out.println("d : " + al[3]);
                System.out.println("e : " + al[4]);
                System.out.println("f : " + al[5]);
                System.out.println("g : " + al[6]);
                System.out.println("h : " + al[7]);
                System.out.println("i : " + al[8]);
                System.out.println("j : " + al[9]);
                System.out.println("k : " + al[10]);
                System.out.println("l : " + al[11]);
                System.out.println("m : " + al[12]);
                System.out.println("n : " + al[13]);
                System.out.println("o : " + al[14]);
                System.out.println("p : " + al[15]);
                System.out.println("q : " + al[16]);
                System.out.println("r : " + al[17]);
                System.out.println("s : " + al[18]);
                System.out.println("t : " + al[19]);
                System.out.println("u : " + al[20]);
                System.out.println("v : " + al[21]);
                System.out.println("w : " + al[22]);
                System.out.println("x : " + al[23]);
                System.out.println("y : " + al[24]);
                System.out.println("z : " + al[25]);
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
