import Control.Applicative
import Data.Char

main = do
    str <- fmap toggleChar <$> getLine
    putStrLn str

toggleChar :: Char -> Char
toggleChar x
    | isLower x = toUpper x
    | isUpper x = toLower x
    | otherwise = x