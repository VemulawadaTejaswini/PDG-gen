import  java.io.*;

public class Main{ 
        public static void main(String[] args){
            int i=0,j;
            int b[];
            String line;
            b = new int[2000];
            try{
                //Scanner n = new Scanner(System.in);
                BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
                while(true){
                    line = k.readLine();
                    String suuti[] = line.split(" ");
                    if(suuti[1].equals("?")){
                        break;
                    }
                    int d = Integer.parseInt(suuti[0]);
                    int e = Integer.parseInt(suuti[2]);
                    if(suuti[1].equals("+")){
                        b[i]=d+e;
                    }else if(suuti[1].equals("-")){
                        b[i]=d-e;
                    }else if(suuti[1].equals("*")){
                        b[i]=d*e;
                    }else if(suuti[1].equals("/")){
                        b[i]=d/e;
                    }
                    i++;
                }
                for(j=0;j<i;j++){
                    System.out.println(b[j]);
                }
            }catch(IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e){
                System.out.println(e);
            }
        }
    }
