import java.util.*;

public class Main {

    public static class Question{
        public int number;
        public boolean isAC;
        public int waCount;
        public Question( int number ){
            this.number = number;
            this.isAC = false;
            this.waCount = 0;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split( " " );
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );
        List<Question> qs = new ArrayList<>();
        for( int i = 0 ; i < m ; i++ ){
            params = in.nextLine().split( " " );
            int number = Integer.parseInt( params[0] );
            String result = params[1];
            boolean exist = false;
            for( int j = 0 ; j < qs.size() ; j++ ){
                Question q = qs.get(j);
                if( q.number == number ){
                    if( !q.isAC ){
                        if( "WA".equals( result ) ){
                            q.waCount++;
                        }
                        else {
                            q.isAC = true;
                        }
                    }
                    exist = true;
                    break;
                }
            }
            if( !exist ){
                Question q = new Question( number );
                if( "WA".equals( result ) ){
                    q.waCount++;
                }
                else {
                    q.isAC = true;
                }
                qs.add( q );
            }

        }

        int waCount = 0;
        int acCount = 0;
        for( int i = 0 ; i < qs.size() ; i++ ){
            Question q = qs.get(i);
            waCount += q.waCount;
            if( q.isAC ){
                acCount++;
            }
        }

        System.out.println( "" + acCount + " " + waCount );

    }

}
