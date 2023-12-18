import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        String sis = sc.nextLine();
        int isis = sis.length();
        char cx = sis.charAt(0);
        ArrayList<Integer> ial = new ArrayList<Integer>();
        int ise = 1;
        for(int i=1;i<isis;i++){
            if(sis.charAt(i)!=cx){
                cx = sis.charAt(i);
                ial.add(ise);
                ise = 1;
            }
            else{
                ise++;
            }
        }
        ial.add(ise);
        if(ial.size()==1){
            System.out.println(isis);
        }
        else{
            int iksis = isis / 2;
            int iiii = 0;
            for(int i=0;i<ial.size();i++){
                iiii += ial.get(i);
                if(iiii >= iksis){
                    int iuc = ial.get(i);
                    if(iiii - iksis < (iiii - iuc - iksis) * (-1)){
                    }
                    else{
                        iiii -= iuc;
                    }
                    iiii = isis - iiii;
                    System.out.println(iiii);
                    break;
                }
            }
        }
    }
}
