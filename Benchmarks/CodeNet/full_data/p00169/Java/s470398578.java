import java.util.*;
public class Main {
     
    class C {
        int ind;
        int value;
        public C(int ind, int value) {
            super();
            this.ind = ind;
            this.value = value;
        }
         
    }
 
    private void doit() {
        Scanner sc = new Scanner(System.in);
         
        while(true){
            String str = sc.nextLine();
            if(str.equals("0")){
                break;
            }
            String [] array = str.split(" ");
            int len = array.length;
            if(len > 22){
            	System.out.println(0);
            	continue;
            }
            int [] data = new int[len];
             
            for(int i =0 ;i  < len; i++){
                data[i] = Integer.parseInt(array[i]);
            }
             
            LinkedList<C> open = new LinkedList<C>();
            open.add(new C(0,0));
            int ans = 0;
            while(! open.isEmpty()){
                C now = open.removeFirst();
                int value = now.value;
                int index = now.ind;
                if(index + 1 == len){
                    if(data[index] == 1){
                        if(value + 11 <= 21){
                            ans = Math.max(ans, value + 11);
                            continue;
                        }
                        else if(value + 1 <= 21){
                        	ans = Math.max(ans, value + 1);
                            continue;
                        }
                        else{
                        	continue;
                        }
                    }
                    else if(data[index] >= 10){
                        value = value + 10;
                    }
                    else{
                        value = value + data[index];
                    }
                    if( value  > 21) value = 0;
                    ans = Math.max(ans, value);
                    continue;
                }
                if(data[index] == 1){
                    index++;
                    open.add(new C(index, value + 1));
                    open.add(new C(index, value + 11));
                }
                else if(data[index] >= 10){
                    index++;
                    open.add(new C(index, value + 10));
                }
                else{
                    index++;
                    open.add(new C(index,value + data[index - 1]));
                }
            }
            System.out.println(ans);
             
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.doit();
 
    }
 
}