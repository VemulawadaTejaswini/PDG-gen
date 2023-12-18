
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class User {
        public List<Integer> friends = new ArrayList<>();
        public List<Integer> blocks = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );
        int k = Integer.parseInt( params[2] );
        int[] as = new int[m];
        int[] bs = new int[m];
        int[] cs = new int[k];
        int[] ds = new int[k];
        User[] users = new User[n];
        for( int i = 0 ; i < m ; i++ ){
            params = sc.nextLine().split(" ");
            as[i] = Integer.parseInt( params[0] );
            bs[i] = Integer.parseInt( params[1] );
            if( users[as[i]-1] == null ){
                users[as[i]-1] = new User();
            }
            if( users[bs[i]-1] == null ){
                users[bs[i]-1] = new User();
            }
            users[as[i]-1].friends.add( bs[i]-1);
            users[bs[i]-1].friends.add( as[i]-1);
        }
        for( int i = 0 ; i < k ; i++ ){
            params = sc.nextLine().split(" ");
            cs[i] = Integer.parseInt( params[0] );
            ds[i] = Integer.parseInt( params[1] );
            if( users[cs[i]-1] == null ){
                users[cs[i]-1] = new User();
            }
            if( users[ds[i]-1] == null ){
                users[ds[i]-1] = new User();
            }
            users[cs[i]-1].blocks.add(ds[i]-1);
            users[ds[i]-1].friends.add(cs[i]-1);
        }

        for( int i = 0 ; i < n ; i++ ){
            users[i].blocks.add( i );
            int count = candidate( users , users[i].friends , users[i].friends , users[i].blocks , i );
            System.out.print( count + " " );
        }
        System.out.println();

//        for( int i = 0 ; i < n ; i++ ){
//            System.out.println( i );
//            if( users[i] == null ){
//                System.out.println( "null" );
//                continue;
//            }
//            System.out.print("\tfriends : ");
//            for( int j = 0 ; j < users[i].friends.size() ; j++ ){
//                System.out.print( users[i].friends.get(j) + " ");
//            }
//            System.out.print("\n\tblocks : ");
//            for( int j = 0 ; j < users[i].blocks.size() ; j++ ){
//                System.out.print( users[i].blocks.get(j) + " ");
//            }
//            System.out.println();
//        }

    }

    public static int candidate(
            User[] users ,
            List<Integer> baseFriends ,
            List<Integer> friends ,
            List<Integer> blocks ,
            int index
    ){
        int count = 0;
        for( int i = 0 ; i < friends.size() ; i++ ){
            int friendIndex = friends.get(i);
            if( !blocks.contains( friendIndex ) ){
                if( !baseFriends.contains( friendIndex ) ){
                    count++;
                }
                blocks.add( friendIndex );
                count += candidate( users , baseFriends , users[ friendIndex ].friends , blocks , friendIndex );
            }
        }
        return count;
    }

}

