two n | n `mod` 2 == 0  = 1 + two (n `div` 2)
      | otherwise       = 0

main = do ln1 <- getLine
          ln2 <- getLine
          let n = read ln1
              ar = map (two .read) (words ln2)
              two_cnt = length (filter (>= 2) ar)
              zero_cnt = length (filter (== 0) ar)
              ans = if two_cnt >= zero_cnt || two_cnt == zero_cnt - 1 && two_cnt + zero_cnt == n then "Yes" else "No"
              in putStrLn ans
