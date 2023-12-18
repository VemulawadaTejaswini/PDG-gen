import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s      = sc.nextInt();
        String str = sc.next();

        boolean[] way = new boolean[s];
        for(int i=0; i<s; i++){
            if(str.charAt(i) == 'E') way[i] = true;
            else                     way[i] = false; 
        }

        int count;
        int min = s;
        for(int i=0; i<s; i++){
            count = 0;
            for(int j=0; j<i; j++){
                if(way[j] == false) count++;
            }
            for(int k=s-1; k>i; k--){
                if(way[k] == true) count++;
            }
            if(count < min) min = count;
        }
        System.out.println(min);
    }
}