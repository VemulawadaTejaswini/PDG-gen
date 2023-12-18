import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);


        //入力読み込み
        int i =0;
        int N =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
        while (sn.hasNextLine()) {
        		String str = sn.nextLine();
            try{
                if(i ==0){
                    N = Integer.parseInt(str);
                    if(N<2 || N>200000){
                        System.out.println("error");
                        return;
                    }
                }else{
                    int x = Integer.parseInt(str);
                    if(x<1 || x > 200000){
                        System.out.println("error2");
                        return;
                    }
					list.add(x);
                }
            }catch(Exception e){
                System.out.println("error3");
                //do nothing
                return;
            }
            i++;
            if(i>N){
                break;
            }
        }     
        sn.close();  

        //logic1
		int y = 0;
		try{
		Integer m = Collections.max(list);
		int maxarray = list.indexOf(m);
		list.remove(maxarray);
		Integer n = Collections.max(list);
		
		for (int j = 0; j < N; j++){
			if(j == maxarray){
				System.out.println(n);
			}else{
				System.out.println(m);
			}
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
  }