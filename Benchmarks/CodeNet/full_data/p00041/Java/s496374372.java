

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
 
 
 class en{
     int fir;
     int sec;
     String enzan;
     int depth;
     en(int fir,int sec, String enzan,int depth){this.fir=fir;this.sec=sec;this.enzan=enzan;this.depth=depth;}
     void make2(){
         int res =0;
         if(enzan.equals("plus")){res=Main.ints[fir]+Main.ints[sec];}
         else if(enzan.equals("minus")){res=Main.ints[fir]-Main.ints[sec];}
         else if(enzan.equals("mul")){res=Main.ints[fir]*Main.ints[sec];}Main.ints2[0]=res;
         int count=1; for(int i=0;i<4;i++){if(i!=fir&&i!=sec){Main.ints2[count]=Main.ints[i];count++;}}
     }
     void make3(){
         int res =0;
         if(enzan.equals("plus")){res=Main.ints2[fir]+Main.ints2[sec];}
         else if(enzan.equals("minus")){res=Main.ints2[fir]-Main.ints2[sec];}
         else if(enzan.equals("mul")){res=Main.ints2[fir]*Main.ints2[sec];}
         Main.ints3[0]=res;
         for(int i=0;i<3;i++){if(i!=fir&&i!=sec){Main.ints3[1]=Main.ints2[i];}}         
     }
     boolean finalMake(){
         int res=0;
         if(enzan.equals("plus")){res=Main.ints3[fir]+Main.ints3[sec];}
         else if(enzan.equals("minus")){res=Main.ints3[fir]-Main.ints3[sec];}
         else if(enzan.equals("mul")){res=Main.ints3[fir]*Main.ints3[sec];}
         return (res==10);
     }
     void print(){
         System.out.println("fir:"+fir+",sec:"+sec+",en:"+enzan+",dep:"+depth);
     }
 }
 class Main{
      
    static int ints[]=new int[4];//
    static int ints2[]=new int[3];
    static int ints3[]=new int[2];
    static Stack<en> ensta=new Stack<en>();
    
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             while((line=br.readLine())!= null){
                 String[] split=line.split(" ");
                 for(int i=0;i<4;i++)ints[i]=Integer.parseInt(split[i]);
                 if(ints[0]==0&&ints[1]==0&&ints[2]==0&&ints[3]==0)break;
                 ensta.clear();
                 if(first()){
                     for(en e:ensta){//e.print();
                     }
                    en e1=ensta.pop();
                    String strs[]=new String[]{(ints[0]+""),(ints[1]+""),(ints[2]+""),(""+ints[3])};
                    String strs2[]=new String[3];
                    String res="("+strs[e1.fir]+" "+changeEn(e1.enzan)+" "+strs[e1.sec]+")";
                    strs2[0]=res;int count=1;
                    for(int i=0;i<4;i++){
                        if(i!=e1.fir&&i!=e1.sec){strs2[count]=strs[i];count++;}
                    }
                    String str3[]=new String[2];
                    en e2=ensta.pop();
                    res="("+strs2[e2.fir]+" "+changeEn(e2.enzan)+" "+strs2[e2.sec]+")";
                    str3[0]=res;
                    for(int i=0;i<3;i++){
                        if(i!=e2.fir&&i!=e2.sec){str3[1]=strs2[i];}
                    }
                    en e3=ensta.pop();
                    res="("+str3[e3.fir]+" "+changeEn(e3.enzan)+" "+str3[e3.sec]+")";
                     System.out.println(res);
                         
                         
                     
                 }else{System.out.println("0");}
                 
                 
                 
             }
             br.close();
         }catch(Exception e){}         
     }
     static String changeEn(String en){
         if(en.equals("plus"))return "+";
         if(en.equals("mul"))return "*";
         if(en.equals("minus"))return "-";return "";
         
     }
     static boolean first(){
         for(int fir=0;fir<3;fir++){
             for(int sec=fir+1;sec<4;sec++){
                 en e1 = new en(fir,sec,"plus",0);
                 e1.make2();//System.out.println(Arrays.toString(ints2));
                 if(second()){ensta.add(e1);return true;}
                 en e11=new en(fir,sec,"mul",0);
                 e11.make2();if(second()){ensta.add(e11);return true;}
             }
         }
         for(int fir=0;fir<4;fir++){
             for(int sec=0;sec<4;sec++){
                 if(sec==fir)continue;
                 en e=new en(fir,sec,"minus",0);
                 e.make2();if(second()){ensta.add(e);return true;}
             }
         }
         
         return false;
     }
     
     static boolean second(){
         for(int fir=0;fir<2;fir++){
             for(int sec=fir+1;sec<3;sec++){
                 en e1 = new en(fir,sec,"plus",1);
                 e1.make3();//System.out.println(Arrays.toString(ints3));
                 if(third()){ensta.add(e1);return true;}
                 en e11=new en(fir,sec,"mul",1);
                 e11.make3();if(third()){ensta.add(e11);return true;}
             }
         }
         for(int fir=0;fir<3;fir++){
             for(int sec=0;sec<3;sec++){
                 if(sec==fir)continue;
                 en e=new en(fir,sec,"minus",1);
                 e.make3();if(third()){ensta.add(e);return true;}
             }
         }
         return false;
     }
      
     static boolean third(){
         en e1 = new en(0,1,"plus",2);
         if(e1.finalMake()){ensta.add(e1);return true;}
         en e2 = new en(0,1,"mul",2);
         if(e2.finalMake()){ensta.add(e2);return true;}
         en e3 =new en(0,1,"minus",2);if(e3.finalMake()){ensta.add(e3);return true;}
         e3=new en(1,0,"minus",2);if(e3.finalMake()){ensta.add(e3);return true;}
         return false;
     }
    
 }