for(int i = 1; i <= N-2; i++) {
            if(A[i] > N-i-1) {
                continue;
            }
            for(int j = i+(int)A[i]+1; j <= N; j++) {
                if(j - i == A[j]+A[i]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);