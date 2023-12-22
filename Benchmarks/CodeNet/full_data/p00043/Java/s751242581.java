

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
 

 class Main{

     static int[] dens=new int[10];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line; int _case=0;
             while((line=br.readLine())!= null){
                 int[] ints=new int[13];for(int i=0;i<13;i++)ints[i]=Integer.parseInt(line.charAt(i)+"");
                 dens=new int[10];
                 for(int i:ints)dens[i]++;//density
                 ArrayList<Integer> intAr=new ArrayList<Integer>();
                 for(int i=1;i<=9;i++){
                     dens[i]++;
                     if(canagari())intAr.add(i);
                     dens[i]--;
                 }
                 String str="";
                 if(intAr.size()==0)str="0";
                 else {for(int val:intAr){
                     str+=val+" ";
                 } str=str.trim();}
                 System.out.println(str);
                 
                 
             }
             br.close();
         }catch(Exception e){}         
     }
    static boolean canagari(){
        //System.out.println(Arrays.toString(dens));
        for(int i=1;i<=9;i++){
            if(dens[i]>=5)return false;
            if(dens[i]<2)continue;
            dens[i]-=2;
            if(canT1()||canK1()){dens[i]+=2;return true;}
            else{dens[i]+=2;}
        }
        return false;
    }
    static boolean canT1(){
        //System.out.println(" "+Arrays.toString(dens));
        for(int i=1;i<=7;i++){
            if(dens[i]==0)continue;
            if(dens[i+1]>=1&&dens[i+2]>=1){
                dens[i]--;dens[i+1]--;dens[i+2]--;
                if(canT2()||canK2()){dens[i]++;dens[i+1]++;dens[i+2]++;return true;}
                else {dens[i]++;dens[i+1]++;dens[i+2]++;}
            }else{return false;}
        }
        return false;
    }
    static boolean canK1(){
        for(int i=1;i<=9;i++){
            if(dens[i]<=2)continue;
            dens[i]-=3;if(canT2()||canK2()){dens[i]+=3;return true;}
            else {dens[i]+=3;}
        }
        return false;
    }
    static boolean canK2(){
        for(int i=1;i<=9;i++){
            if(dens[i]<=2)continue;
            dens[i]-=3;if(canT3()||canK3()){dens[i]+=3;return true;}
            else {dens[i]+=3;}
        }
        return false;
    }
    static boolean canK3(){
        for(int i=1;i<=9;i++){
            if(dens[i]<=2)continue;
            dens[i]-=3;if(canT4()||canK4()){dens[i]+=3;return true;}
            else {dens[i]+=3;}
        }
        return false;
    }
    static boolean canK4(){
        for(int i=1;i<=9;i++){
            if(dens[i]<=2)continue;
            return true;
        }
        return false;
    }
static    boolean canT2(){
    //System.out.println(" _"+Arrays.toString(dens));
        for(int i=1;i<=7;i++){
            if(dens[i]==0)continue;
            if(dens[i+1]>=1&&dens[i+2]>=1){
                dens[i]--;dens[i+1]--;dens[i+2]--;
                if(canT3()||canK3()){dens[i]++;dens[i+1]++;dens[i+2]++;return true;}
                else {dens[i]++;dens[i+1]++;dens[i+2]++;}
            }else{return false;}
        }
        return false;
    }
    static boolean canT3(){
        //System.out.println(" _ "+Arrays.toString(dens));
        for(int i=1;i<=7;i++){
            if(dens[i]==0)continue;
            if(dens[i+1]>=1&&dens[i+2]>=1){
                dens[i]--;dens[i+1]--;dens[i+2]--;
                if(canT4()||canK4()){dens[i]++;dens[i+1]++;dens[i+2]++;return true;}
                else {dens[i]++;dens[i+1]++;dens[i+2]++;}
            }else{return false;}
        }
        return false;
    }
    static boolean canT4(){
        //System.out.println(" _ _"+Arrays.toString(dens));
        for(int i=1;i<=7;i++){
            if(dens[i]==0)continue;
            if(dens[i+1]>=1&&dens[i+2]>=1){
                return true;
            }
        }
        return false;
    }
 }