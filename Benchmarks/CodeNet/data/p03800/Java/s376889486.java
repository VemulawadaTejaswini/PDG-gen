import java.util.*;

public class Main{
    static int N;
    static String s;
    static char[] c;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        s = sc.next();
        c = s.toCharArray();
        sc.close();
        char[] ans = new char[N];

        ans[0] = 'S'; ans[1] = 'S';
        for(int i = 0; i < N; i++){
            if(i == 0){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[N-1] = ans[i+1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[N-1] = ans[i+1];
                }
            }
            if(i!=0 && i < N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[i+1] = ans[i-1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[i+1] = ans[i-1];
                }
            }
            if(i == N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[i+1] != ans[i-1]){
                        break;
                    } else
                        continue;
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W'){
                            break;
                        } else
                            continue;
                    else
                        if(ans[i+1] != 'S'){
                            break;
                        } else {
                            continue;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W')
                            break;
                        else
                            continue;
                    else
                        if(ans[i+1] != 'S')
                            break;
                        else
                            continue;
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[i+1] != ans[i-1])
                        break;
                    else
                        continue;
                }
            }
            if(i == N-1){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[0] != ans[i-1]){
                    } else {
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W'){
                        } else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S'){
                        } else {
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[0] != ans[i-1])
                        break;
                    else{
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                }
            }
        }
        ans[0] = 'S'; ans[1] = 'W';
        for(int i = 0; i < N; i++){
            if(i == 0){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[N-1] = ans[i+1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[N-1] = ans[i+1];
                }
            }
            if(i!=0 && i < N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[i+1] = ans[i-1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[i+1] = ans[i-1];
                }
            }
            if(i == N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[i+1] != ans[i-1]){
                        break;
                    } else
                        continue;
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W'){
                            break;
                        } else
                            continue;
                    else
                        if(ans[i+1] != 'S'){
                            break;
                        } else {
                            continue;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W')
                            break;
                        else
                            continue;
                    else
                        if(ans[i+1] != 'S')
                            break;
                        else
                            continue;
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[i+1] != ans[i-1])
                        break;
                    else
                        continue;
                }
            }
            if(i == N-1){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[0] != ans[i-1]){
                    } else {
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W'){
                        } else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S'){
                        } else {
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[0] != ans[i-1])
                        break;
                    else{
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                }
            }
        }
        ans[0] = 'W'; ans[1] = 'S';
        for(int i = 0; i < N; i++){
            if(i == 0){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[N-1] = ans[i+1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[N-1] = ans[i+1];
                }
            }
            if(i!=0 && i < N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[i+1] = ans[i-1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[i+1] = ans[i-1];
                }
            }
            if(i == N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[i+1] != ans[i-1]){
                        break;
                    } else
                        continue;
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W'){
                            break;
                        } else
                            continue;
                    else
                        if(ans[i+1] != 'S'){
                            break;
                        } else {
                            continue;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W')
                            break;
                        else
                            continue;
                    else
                        if(ans[i+1] != 'S')
                            break;
                        else
                            continue;
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[i+1] != ans[i-1])
                        break;
                    else
                        continue;
                }
            }
            if(i == N-1){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[0] != ans[i-1]){
                    } else {
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W'){
                        } else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S'){
                        } else {
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[0] != ans[i-1])
                        break;
                    else{
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                }
            }
        }
        ans[0] = 'W'; ans[1] = 'W';
        for(int i = 0; i < N; i++){
            if(i == 0){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[N-1] = ans[i+1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i+1] == 'S')
                        ans[N-1] = 'W';
                    else
                        ans[N-1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[N-1] = ans[i+1];
                }
            }
            if(i!=0 && i < N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    ans[i+1] = ans[i-1];
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        ans[i+1] = 'W';
                    else
                        ans[i+1] = 'S';
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    ans[i+1] = ans[i-1];
                }
            }
            if(i == N-2){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[i+1] != ans[i-1]){
                        break;
                    } else
                        continue;
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W'){
                            break;
                        } else
                            continue;
                    else
                        if(ans[i+1] != 'S'){
                            break;
                        } else {
                            continue;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[i+1] != 'W')
                            break;
                        else
                            continue;
                    else
                        if(ans[i+1] != 'S')
                            break;
                        else
                            continue;
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[i+1] != ans[i-1])
                        break;
                    else
                        continue;
                }
            }
            if(i == N-1){
                if(ans[i] == 'S' && c[i] == 'o'){
                    if(ans[0] != ans[i-1]){
                    } else {
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                } else if(ans[i] == 'S' && c[i] == 'x'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W'){
                        } else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S'){
                        } else {
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'o'){
                    if(ans[i-1] == 'S')
                        if(ans[0] != 'W')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                    else
                        if(ans[0] != 'S')
                            break;
                        else{
                            for(int j = 0; j < N; j++){
                                System.out.print(ans[j]);
                            }
                            return;
                        }
                } else if(ans[i] == 'W' && c[i] == 'x'){
                    if(ans[0] != ans[i-1])
                        break;
                    else{
                        for(int j = 0; j < N; j++){
                            System.out.print(ans[j]);
                        }
                        return;
                    }
                }
            }
        }
        System.out.println(-1);

    }
}