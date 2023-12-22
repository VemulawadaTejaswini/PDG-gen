


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
 

public class Main{
          
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[]=line.split(" ");
                int n=Integer.parseInt(spl[0]),q=Integer.parseInt(spl[1]);
                int[] parent=new int[n];for(int i=0;i<n;i++)parent[i]=i;
                for(int i=0;i<q;i++){
                    line=br.readLine();spl=line.split(" "); int[] ns=new int[3];
                    for(int j=0;j<3;j++) ns[j]=Integer.parseInt(spl[j]);
                    if(ns[0]==0){//UNITE
                        if(parent[ns[1]]!=parent[ns[2]]){int tmp=parent[ns[1]];
                            for(int k=0;k<n;k++){
                                if(parent[k]==tmp)
                                    parent[k]=parent[ns[2]];
                            }
                        }
                       // System.out.println(Arrays.toString(parent));
                    }else{//Print
                        if(parent[ns[1]]==parent[ns[2]])System.out.println("1");
                        else System.out.println("0");
                    }
                }
                
             }
         }catch(Exception e){e.printStackTrace();}         
     }  
     
     
}